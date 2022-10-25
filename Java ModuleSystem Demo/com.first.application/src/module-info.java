module com.first.application
{
    /*
    * exports is used to make the package Publicly available for other modules.
    * does not export sub-packages.
    */
//    exports com.first.application;
//    exports com.first.application1;

    /*
    * exports - to is used to selective availability.
    *
    */
    exports com.first.application to com.abc.newApp;
    exports com.first.application1 to com.abc.newApp;

    //Import Subpackages
    exports com.first.application.utill;
}