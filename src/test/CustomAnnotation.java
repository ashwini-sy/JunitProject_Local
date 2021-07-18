package test;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Target({ElementType.ANNOTATION_TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Tag("Sanitytest")
@DisplayName("PositiveTest")
@Test
public @interface CustomAnnotation {

}
