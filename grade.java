
/**
 * Contains methods for all shared modules among BIT and Computing 
 * 
 * @author Brent Gammon 
 * @version 3/1/16
 */
public abstract class grade
{
    /**
     * Constructor for objects of class grade
     */
    public grade(){}
    
    /**
     * Calulates the grade for into java module
     * @param doubleass1,ass2,ass3,ass4,ass5 is the result for that piece of coursework
     * @return double grade the amount the grade is worth for the year
     */
    public double introJava(double ass1,double ass2,double ass3,double ass4,double ass5){
        double a = ((5%100)*ass1)/100;
        double b = ((20%100)*ass2)/100;
        double c = ((20%100)*ass3)/100;
        double d = ((25%100)*ass4)/100;
        double e = ((30%100)*ass5)/100;
        double grade = ((a+b+c+d+e)/8);//*100;       
        return grade;
    }
    
    /**
     * Calulates the grade for maths module
     * @param double algebra,stats,proof,setTheory,mathExam is the result for that piece of coursework
     * @return double grade the amount the grade is worth for the year
     */
    public double maths(double algebra,double stats,double proof,double setTheory, double mathExam)
    {
        double a = ((10%100)*algebra)/100;
        double b = ((15%100)*stats)/100;
        double c = ((12.5%100)*proof)/100;
        double d = ((12.5%100)*setTheory)/100;
        double e = ((50%100)*setTheory)/100;
        double grade = ((a+b+c+d+e)/8);//*100;
        return grade;
    }
    
    /**
     * Calulates the grade for web and database module
     * @param double html,javascript,mySQL,php is the result for that piece of coursework
     * @return double grade the amount the grade is worth for the year
     */
    public double web(double html,double javascript,double mySQL,double php,double webExam)
    {
        double a = ((10%100)*html)/100;
        double b = ((15%100)*javascript)/100;
        double c = ((12.5%100)*mySQL)/100;
        double d = ((12.5%100)*php)/100;
        double e = ((50%100)*webExam)/100;
        double grade = ((a+b+c+d+e)/8);//*100;
        return grade;
    }
    
    /**
     * Calulates the grade for computer systems module
     * @param double test1,test2,test3,test4,computerExam is the result for that piece of coursework
     * @return double grade the amount the grade is worth for the year
     */
    public double computer(double test1,double test2,double test3,double test4,double computerExam)
    {
        double a = ((12.5%100)*test1)/100;
        double b = ((12.5%100)*test2)/100;
        double c = ((12.5%100)*test3)/100;
        double d = ((12.5%100)*test4)/100;
        double e = ((50%100)*computerExam)/100;
        double grade = ((a+b+c+d+e)/8);//*100;
        return grade;
    }
    
    /**
     * Calulates the grade for hci module
     * @param double out,device,design is the result for that piece of coursework
     * @return double grade the amount the grade is worth for the year
     */
    public double hci(double out,double device,double design,double hciExam)
    {
        double a = ((12.5%100)*out)/100;
        double b = ((12.5%100)*device)/100;
        double c = ((25%100)*design)/100;
        double d = ((50%100)*hciExam)/100;
        double grade = ((a+b+c+d)/8);//*100;
        return grade;
    }
    
    /**
     * Calulates the grade for people and computing module
     * @param double precis,plagiarism,poster,video,presentation,portfolio,reflection,examination,killerRobot is the result for that piece of coursework
     * @return double grade the amount the grade is worth for the year
     */
    public double people(double precis,double plagiarism,double poster,double video,double presentation,double portfolio,double reflection,double examination,double killerRobot)
    {
        double a = ((4%100)*precis)/100;
        double b = ((8%100)*plagiarism)/100;
        double c = ((12%100)*poster)/100;
        double d = ((16%100)*video)/100;
        double e = ((12%100)*presentation)/100;
        double f = ((10%100)*portfolio)/100;
        double g = ((10%100)*reflection)/100;
        double h = ((16%100)*examination)/100;
        double i = ((12%100)*killerRobot)/100;
        double grade = ((a+b+c+d+e+f+g+h+i)/8);//*100;
        return grade;
    }
    
    /**
     * Calulates the grade for agile software deveopment module
     * @param double scrum,sub,essay,exam is the result for that piece of coursework
     * @return double grade the amount the grade is worth for the year
     */
    public double agile(double scrum,double sub,double essay,double exam)
    {
        double a = ((25%100)*scrum)/100;
        double b = ((5%100)*sub)/100;
        double c = ((20%100)*essay)/100;
        double d = ((50%100)*exam)/100;
        double grade = ((a+b+c+d)/8);//*100;
        return grade;
    }
    
    /**
     * Calulates the grade for infomation system analysis module
     * @param double work1,work2,work3,work4,report is the result for that piece of coursework
     * @return double grade the amount the grade is worth for the year
     */
    public double infoSys(double useCaseDia,double useCaseDesc,double classDia,double sequence,double caseStudy)
    {
        double a = ((10%100)*useCaseDia)/100;
        double b = ((10%100)*useCaseDesc)/100;
        double c = ((15%100)*sequence)/100;
        double d = ((15%100)*classDia)/100;
        double e = ((50%100)*caseStudy)/100;
        double grade = ((a+b+c+d+e)/8);//*100;
        return grade;
    }
    
    /**
     * Calulates the grade for databse module
     * @param double conceptual,logical,implemtation,exam,exercise is the result for that piece of coursework
     * @return double grade the amount the grade is worth for the year
     */
    public double database(double conceptual,double logical,double implementation,double exam,double exercises)
    {
        double e = ((20%100)*exercises)/100;
        double a = ((30%100)*conceptual)/100;
        double b = ((20%100)*logical)/100;
        double c = ((30%100)*implementation)/100;
        double sum = a+b+c+e;
        double overal = (sum/100)*40;//400;
        double d = ((60%100)*exam)/100;
        double grade = ((overal+d)/8);//*100;
        return grade;
    }
}
