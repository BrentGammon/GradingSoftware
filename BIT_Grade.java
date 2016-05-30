
/**
 * contains methods used to calulate BIT modules
 * 
 * @author Brent Gammon
 * @version 3/1/16
 */
public class BIT_Grade extends grade
{
    /**
     * Constructor for objects of class BIT_Grade
     */
    public BIT_Grade(){}

    /**
     * Calulates the grade for management module
     * @param double work1,work2,work3,work4 is the result for that piece of coursework
     * @return double grade the amount the grade is worth for the year
     */
    public double management(double work1,double work2,double work3,double work4)
    {
        double a = ((10%100)*work1)/100;
        double b = ((10%100)*work2)/100;
        double c = ((10%100)*work3)/100;
        double d = ((70%100)*work4)/100;
        double grade = ((a+b+c+d)/8);
        return grade;
    }
    
    /**
     * Calulates the grade for marketing module
     * @param double work1,work2,work3 is the result for that piece of coursework
     * @return double grade the amount the grade is worth for the year
     */
    public double marketing(double work1,double work2,double work3)
    {
        double a = ((25%100)*work1)/100;
        double b = ((15%100)*work2)/100;
        double c = ((60%100)*work3)/100;
        double grade = ((a+b+c)/8);
        return grade;
    }
    
    /**
     * Calulates the grade for financial module
     * @param double essay,test,exam is the result for that piece of coursework
     * @return double grade the amount the grade is worth for the year
     */
    public double financial(double essay, double test, double exam)
    {
        double a = ((15%100)*essay)/100;
        double b = ((15%100)*test)/100;
        double c = ((70%100)*exam)/100;
        double grade = ((a+b+c)/8);
        return grade;
    }
    
    /**
     * Calulates the grade for operation module
     * @param double test1,test2,exam is the result for that piece of coursework
     * @return double grade the amount the grade is worth for the year
     */
    public double operation(double test1,double test2, double exam)
    {
        double a = ((10%100)*test1)/100;
        double b = ((20%100)*test2)/100;
        double c = ((70%100)*exam)/100;
        double grade = ((a+b+c)/8);
        return grade; 
    }
    
    /**
     * Calulates the grade for theory module
     * @param double test,exam is the result for that piece of coursework
     * @return double grade the amount the grade is worth for the year
     */
    public double theory(double test,double exam)
    {
        double a = ((40%100)*test)/100;
        double b = ((60%100)*exam)/100;
        double grade = ((a+b)/8);
        return grade;
    }
    
    /**
     * Calulates the grade for enterprise module
     * @param double report,essay,presentation,journal is the result for that piece of coursework
     * @return double grade the amount the grade is worth for the year
     */
    public double enterprise(double report,double essay,double presentation,double journal)
    {
        double a = ((25%100)*report)/100;
        double b = ((40%100)*essay)/100;
        double c = ((20%100)*presentation)/100;
        double d = ((15%100)*journal)/100;
        double grade = ((a+b+c+d)/8);
        return grade;
    }
}
