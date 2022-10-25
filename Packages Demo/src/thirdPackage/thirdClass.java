package thirdPackage;
import firstPackage.firstClass;//explicit import is better.
import secondPackage.secondClass;
public class thirdClass
{
    firstClass fc = new firstClass();
    secondClass sc = new secondClass();
}