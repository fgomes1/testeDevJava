package com.algaworks.dd;

public class InverterString {

    public static void main(String[] args) {
        String str = "exemplo";
        char[] strArray = new char[str.length()];

        // armazena cada caractere da string em um array de caracteres
        for (int i = 0; i < str.length(); i++) {
            strArray[i] = str.charAt(i);
        }

        // inverte a ordem dos caracteres no array
        for (int i = 0, j = strArray.length - 1; i < j; i++, j--) {
            char temp = strArray[i];
            strArray[i] = strArray[j];
            strArray[j] = temp;
        }

        // reconstrói a string a partir do array de caracteres invertido
        String strInvertida = "";
        for (int i = 0; i < strArray.length; i++) {
            strInvertida += strArray[i];
        }
        
        // imprime a string 
        System.out.println("String atual:" + str);
        // imprime a string invertida
        System.out.println("String invertida:" + strInvertida);
    }
}
