package firstPackage;
import secondPackage.*;//implicit import
import thirdPackage.*;
import thirdPackage.firstSubPack.*;

public class firstClass
{
    secondClass sc = new secondClass();
    thirdClass tc = new thirdClass();
    SubPackClass spc = new SubPackClass();
}