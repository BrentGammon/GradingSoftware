
/**
 * Calulates the grades for each computing modules.
 * 
 * @author Brent Gammon 
 * @version 3/1/16
 */
public class Computing_Grade extends grade
{
    /**
     * Constructor for objects of class Computing_Grade
     */
    public Computing_Grade(){}
    
    /**
     * Calulates the grade for further java module
     * @param double classExercise is the result for that piece of coursework
     * @param double inheritancePolymorphism is the result for that piece of coursework
     * @param double GUIException is the result for that piece of coursework
     * @param double classTest is the result for that piece of coursework
     * @return double grade the amount the grade is worth for the year
     */
    public double furtherJavaAverage(double classExercise,double inheritancePolymorphism,double GUIException,double classTest){
        double a = ((20%100)*classExercise)/100;
        //double a1 = a *classExercise/100;
        double b = ((20%100)*inheritancePolymorphism)/100;
        double c = ((30%100)*GUIException)/100;
        double d = ((30%100)*classTest)/100;
        double grade = ((a+b+c+d)/8);//*100;
        
        return grade;
    }
    
    /**
     * Calulates the grade for further computer application module
     * @param double work1,work2,work3,work4,report is the result for that piece of coursework
     * @return double grade the amount the grade is worth for the year
     */
    public double computerAppAverage(double work1,double work2,double work3,double work4,double work5, double report)
    {
        double a = ((10%100)*work1)/100;
        double b = ((10%100)*work2)/100;
        double c = ((10%100)*work3)/100;
        double d = ((10%100)*work4)/100;
        double e = ((10%100)*work5)/100;
        double f = ((50%100)*report)/100;
        double grade = ((a+b+c+d+e+f)/8);
        return grade;
    }
    
    /**
     * Calulates the grade for web development module
     * @param double ci,ajax,exam is the result for that piece of coursework
     * @return double grade the amount the grade is worth for the year
     */
    public double web(double ci,double ajax,double exam)
    {
        double a = ((25%100)*ci)/100;
        double b = ((25%100)*ajax)/100;
        double c = ((50%100)*exam)/100;
        double grade = ((a+b+c)/8);
        return grade;
    }
    
    /**
     * Calulates the grade for software engineering module
     * @param double essay1,essay2,essay3,essay4,part,exam is the result for that piece of coursework
     * @return double grade the amount the grade is worth for the year
     */
    public double engineering(double essay1,double essay2,double essay3,double essay4,double part,double exam)
    {
        double a = ((10%100)*essay1)/100;
        double b = ((10%100)*essay2)/100;
        double c = ((10%100)*essay3)/100;
        double d = ((10%100)*essay4)/100;
        double e = ((10%100)*part)/100;
        double f = ((50%100)*exam)/100;
        double grade = ((a+b+c+d+e+f)/8);
        return grade;
    }
    
    /**
     * Calulates the grade for software project module
     * @param double project,logbook is the result for that piece of coursework
     * @return double grade the amount the grade is worth for the year
     */
    public double project(double project,double logbook)
    {
        double a = ((60%100)*project)/100;
        double b = ((40%100)*logbook)/100;
        double grade = ((a+b)/8);
        return grade;
    }
    
    /**
     * Calulates the grade for networking module
     * @param double coursework1,coursework2,exam is the result for that piece of coursework
     * @return double grade the amount the grade is worth for the year
     */
    public double network(double coursework1,double coursework2,double exam)
    {
        double a = ((25%100)*coursework1)/100;
        double b = ((25%100)*coursework2)/100;
        double c = ((50%100)*exam)/100;
        double grade = ((a+b+c)/8);
        return grade;
    }
}
