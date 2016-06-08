package tp2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import korat.finitization.IClassDomain;
import korat.finitization.IFinitization;
import korat.finitization.IIntSet;
import korat.finitization.ILongSet;
import korat.finitization.IObjSet;
import korat.finitization.impl.FinitizationFactory;

/**
 * This class represents a server which accepts connections and manages bans an exceptions
 * 
 * @author 
 * @author 
 * @version 0.1
 */

public class Server implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long expirationTime= new Long(60000);
		
	private Long lastUpdate;
	
	/**
	 * A set of exceptions
	 */
	SinglyLinkedList exceptions;
	
	/**
	 * A list of bans
	 */
	StrictlySortedSinglyLinkedList bans;
	
	/**
	 * It returns the current system time
	 */
	private ITime time;
	
	public void setTime(ITime time) {
		this.time = time;
	}

	/**
	 * Creates a new server
	 */
	public Server() {
		this.exceptions = new SinglyLinkedList();
		this.bans = new StrictlySortedSinglyLinkedList();
		this.time = new RealTime();
	}
	
	/**
	 * Accepts a new connection.
	 * If there's a ban for the connecting IP and the ban is not yet due then the connection will be refused.
	 * It returns true iff the connection was accepted.
	 */
	public boolean connect(IP ip) {
		if(bans.containsIP(ip))
			return false;
		else
			return true;
	}
	
	/**
	 * Add a new exception.
	 * If there's a ban for the exception's IP then the ban will be removed.
	 * It returns true iff the exception was successfully added.
	 */
	public boolean addException(IP ip) {
		if (exceptions.contains(ip)) {
			return false;
		}
		else{
			bans.removeFromIP(ip);
			exceptions.add(ip);
			return true;
		}
	}
	
	/**
	 * Remove IP from exception list.
	 * It returns true iff the IP was removed from the exception list.
	 */
	public boolean removeException(IP ip) {
		return exceptions.remove(ip);
	}
	
	/**
	 * Adds a new ban iff a ban for the same IP doesn't exist and there's not an exception for the bans IP
	 * returns true iff the ban was successfully added
	 */
	public boolean addBan(IP ban) {
		//no repeated
		if (bans.containsIP(ban)) {
			return false;
		}
		
		//banned IP's cannot be in the exceptions list
		if(exceptions.contains(ban))
			return false;
		
		//create new banned IP with the currentTime plus the expirationTime constant.
		IPBan ipban = new IPBan(ban, time.getCurrentTime()+expirationTime);
		bans.add(ipban);
		return true;
	}
	
	/** Removes the IP from the bans list
	*/
	public boolean removeBan(IP ban) {
		//no repeated
		if (!bans.containsIP(ban)) {
			return false;
		}
		
		//remove the banned IP's from bans list
		bans.removeFromIP(ban);
		
		return true;
	}
	
	/**
	 * Update the banned list and the lastUpdate time
	 * @return
	 */
	public void update() {

		lastUpdate = time.getCurrentTime();
	
		
		IPBan b;
		
		while(bans.getSize()>0 && (b=bans.get(0)).getExpires().compareTo(lastUpdate) <= 0){
			bans.removeFromIP(b.ip);
		}

	}
	
	public boolean repOK(){
		//check SinglyLinkedList repOk
		if	(exceptions.header == null) return false;
		if (exceptions.header.element != null) return false;
		Set<Entry> visited = new HashSet<Entry>();
		Set<IP> visitedIp = new HashSet<IP>();
		visited.add(exceptions.header);
		Entry current = exceptions.header.next;
		while (true){
			if (current == null)
				break;
			if (!visited.add(current))
				return false;
			if (current.element == null) return false;
			if	(!visitedIp.add(current.element))
				return false;
			current = current.next;
		}
		if (visited.size()-1 != exceptions.size){
			return false;
		}
		if (bans.header == null) return false;
		if (bans.header.element != null) return false;
		Set<Node> visitedBans = new HashSet<Node>();
		Set<IP> visitedIpBans = new HashSet<IP>();
		visitedBans.add(bans.header);
		Node currentBan = bans.header.next;
		while (true){
			if (currentBan == null)
				break;
			if (!visitedBans.add(currentBan))
				return false;
			if (currentBan.element == null) return false;
			if (currentBan.element.ip == null) return false;
			if	(!visitedIpBans.add(currentBan.element.ip))
				return false;
			currentBan = currentBan.next;
		}
		if (visitedBans.size()-1 != bans.size){
			return false;
		}
		
		Node currentOrderedBan = bans.header.next;
		while (true){
			if(currentOrderedBan == null) break;
			if (currentOrderedBan.next == null)
				break;
			if (currentOrderedBan.element.expires >= currentOrderedBan.next.element.expires)
				return false;
			currentOrderedBan = currentOrderedBan.next;
		}
		Node currentTimeBan = bans.header.next;
		while (true){
			if (currentTimeBan == null)
				break;
			if (currentTimeBan.element.expires <= this.lastUpdate)
				return false;
			currentTimeBan = currentTimeBan.next;
		}
		
		for (IP ip1:visitedIp)
			for (IP ip2:visitedIpBans)
				if (ip1.equals(ip2)) return false;
		if(this.time.getCurrentTime()<this.lastUpdate)return false;
		return true;
		
	}
	
	private static List<IP> fixedIPList() {
		ArrayList<IP> res = new ArrayList<IP>(20);
		res.add(new IP(102,103,254,98));
		res.add(new IP(102,152,254,98));
		res.add(new IP(102,103,233,98));
		res.add(new IP(102,103,254,5));
		res.add(new IP(1,103,254,98));
		res.add(new IP(192,168,24,98));
		res.add(new IP(192,168,12,98));
		res.add(new IP(200,13,233,98));
		res.add(new IP(10,103,254,5));
		res.add(new IP(111,13,254,98));
		res.add(new IP(10,10,4,1));
		res.add(new IP(10,52,54,98));
		res.add(new IP(2,3,233,98));
		res.add(new IP(102,13,4,5));
		res.add(new IP(111,103,254,98));
		res.add(new IP(192,168,0,98));
		res.add(new IP(192,168,0,9));
		res.add(new IP(20,13,33,15));
		res.add(new IP(120,3,2,5));
		res.add(new IP(110,13,20,98));
		return res;		
	}
	
	
	private static List<Long> fixedLongList() {
		ArrayList<Long> res = new ArrayList<Long>(20);
		res.add(new Long(100000));
		res.add(new Long(200000));
		res.add(new Long(300000));
		res.add(new Long(400000));
		res.add(new Long(500000));
		res.add(new Long(600000));
		res.add(new Long(700000));
		res.add(new Long(800000));
		res.add(new Long(900000));
		res.add(new Long(1000000));
		res.add(new Long(1100000));
		res.add(new Long(1200000));
		res.add(new Long(1300000));
		res.add(new Long(1400000));
		res.add(new Long(1500000));
		res.add(new Long(1600000));
		res.add(new Long(1700000));
		res.add(new Long(1800000));
		res.add(new Long(1900000));
		res.add(new Long(2000000));
		return res;		
	}	
	
	
	
	public static IFinitization finServer(int maxSizeLists) {

		IFinitization f = FinitizationFactory.create(Server.class);

		IObjSet exceptionsLists = f.createObjSet(SinglyLinkedList.class, false);
		exceptionsLists.addClassDomain(f.createClassDomain(SinglyLinkedList.class, 1));
			
		
		IObjSet entries = f.createObjSet(Entry.class, true);
		entries.addClassDomain(f.createClassDomain(Entry.class, maxSizeLists+1));
		IIntSet sizes = f.createIntSet(0, maxSizeLists);

			
		IObjSet bansLists = f.createObjSet(StrictlySortedSinglyLinkedList.class, false);
		bansLists.addClassDomain(f.createClassDomain(StrictlySortedSinglyLinkedList.class, 1));

		IObjSet nodes = f.createObjSet(Node.class, true);
		nodes.addClassDomain(f.createClassDomain(Node.class, maxSizeLists+1));
	

		List<Long> longsList = fixedLongList();
		IObjSet longs = f.createObjSet(Long.class, false);
		IClassDomain longsClassDomain = f.createClassDomain(Long.class);
		longsClassDomain.includeInIsomorphismCheck(false);
		for (int i = 0; i < maxSizeLists; i++) {
			longsClassDomain.addObject(longsList.get(i));
		}
		longs.addClassDomain(longsClassDomain);

		int listElems = maxSizeLists + 1;

		List<IP> IPList = fixedIPList();
		IObjSet ips = f.createObjSet(IP.class, true);
		IClassDomain elemsClassDomain = f.createClassDomain(IP.class);
		elemsClassDomain.includeInIsomorphismCheck(false);
		for (int i = 0; i < listElems; i++) {
			elemsClassDomain.addObject(IPList.get(i));
		}
		ips.addClassDomain(elemsClassDomain);
		

		IObjSet ipbans = f.createObjSet(IPBan.class, true);
		ipbans.addClassDomain(f.createClassDomain(IPBan.class, maxSizeLists));
		

		f.set("exceptions", exceptionsLists);
		
		f.set("SinglyLinkedList.header", entries);
		f.set("SinglyLinkedList.size", sizes);		
		f.set("Entry.next", entries);
		
		f.set("Entry.element", ips);
		
		f.set("bans", bansLists);
		f.set("StrictlySortedSinglyLinkedList.header", nodes);
		f.set("StrictlySortedSinglyLinkedList.size", sizes);
		f.set("Node.next", nodes);
		
		f.set("Node.element", ipbans);
		f.set("IPBan.ip", ips);
		f.set("IPBan.expires", longs);
		
		f.set("lastUpdate", longs);
		
		return f;
	}


	@Override
	public String toString() {
		return "Server [lastUpdate=" + lastUpdate + ", exceptions=" + exceptions.toString() + ", bans=" + bans.toString() + "]";
	} 

	
	
}
