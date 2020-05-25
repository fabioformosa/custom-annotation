package it.fabioformosa.lab.customannotation;

import java.util.Arrays;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

public class EnableAnnotationConfigRegistrar implements ImportBeanDefinitionRegistrar {

  @Override
  public void registerBeanDefinitions(AnnotationMetadata enableAnnotationMetadata,
      BeanDefinitionRegistry registry) {
    System.out.println("EnableAnnotationConfigRegistrar registering...");
    AnnotationAttributes enableAnnotationAttributes = new AnnotationAttributes(
        enableAnnotationMetadata.getAnnotationAttributes(EnableAnnotation.class.getName()));

    String[] basePackages = enableAnnotationAttributes.getStringArray("basePackages");

    System.out.println("EnableAnnotationConfigRegistrar scanning packages: " + Arrays.toString(basePackages));
    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(basePackages);

  }

}
