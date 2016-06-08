package tp2;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.junit.experimental.theories.ParametersSuppliedBy;

/** 
 * Interface generadora de parametros para la Teoria Test  
 * */
@Retention(RetentionPolicy.RUNTIME)
@ParametersSuppliedBy(SSServerGenSupplier.class)
public @interface SSServerGen {
}