module dev.mccue.guava.math {
    requires static com.google.errorprone.annotations;
    requires static dev.mccue.jsr305;
    requires static org.checkerframework.checker.qual;

    requires dev.mccue.guava.base;
    requires dev.mccue.guava.primitives;

    exports dev.mccue.guava.math;
}