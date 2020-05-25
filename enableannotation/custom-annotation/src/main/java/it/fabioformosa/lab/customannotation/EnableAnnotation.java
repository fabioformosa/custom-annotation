package it.fabioformosa.lab.customannotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AliasFor;


@Retention(RUNTIME)
@Target(TYPE)
@Import(EnableAnnotationConfigRegistrar.class)
public @interface EnableAnnotation {

  String[] basePackages() default "*";

  @AliasFor(annotation = Import.class, attribute = "value")
  Class<?>[] value() default { EnableAnnotationConfigRegistrar.class };

}
