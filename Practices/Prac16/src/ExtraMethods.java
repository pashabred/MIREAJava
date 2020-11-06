public class ExtraMethods {
    static boolean checkIfContains(Object[] arr, Object toCheckValue) {
        for (Object element : arr) {
            if (element == toCheckValue) {
                return true;
            }
        }
        return false;
    }
}
