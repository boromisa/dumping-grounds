package com.mycompany.app;

public class Concat {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String yo = "/usr/local/Cellar/wildfly-as/8.1.0.Final/libexec/standalone/deployments/umod.war/images/respondent/avatars/Occupations/PilotOldFashioned_Female_Light.png";

        String yes = "/usr/local/Cellar/wildfly-as/8.1.0.Final/libexec/standalone/deployments/umod.war";

        String you = yo.substring(yes.length());

        System.out.println("vad ar you: " + you);

    }

}
