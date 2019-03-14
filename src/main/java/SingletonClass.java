public class SingletonClass {

    /**
     * SingletonClass has no argument !
     */
    private static SingletonClass singletonClass;

    // Private Constructor
    private SingletonClass() {}

    // Get the instance of the singletonClass
    public static synchronized SingletonClass getInstance() {  // threadsafe implementation
        if (singletonClass == null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }
}
