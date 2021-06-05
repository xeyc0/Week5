package ch.zhaw.iwi.devops.fizzbuzz;

public class newFB {
    

    public String gradeEvaluation(int zahl){
        if (zahl <= 20){
            return "Very bad";
        }else if (zahl >20 && zahl <= 40){
            return "Bad";
        }else if (zahl >40 && zahl <=50){
            return "Medium";
        }else if (zahl >50 && zahl <=70){
            return "Good";
        }else if (zahl >70 && zahl <=90){
            return "Very good";
        }else if (zahl >90){
        return "Excellent";
        }
        return "Invalid";
    }
    

    
}
