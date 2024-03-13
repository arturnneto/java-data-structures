package utils;

import java.util.function.Supplier;

public interface TestUtils {

    Supplier<String> errorMsg = () -> "expected and found don't match!";


}
