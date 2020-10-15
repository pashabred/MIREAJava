public class Telephone {
    private String code;
    private String firstpart;
    private String middletpart;
    private String lastpart;
    private String formattedNumber;
    Telephone(String number) {
        StringBuilder stringBuffer = new StringBuilder(number);
        this.code = stringBuffer.substring(0,stringBuffer.length()-10);
        if (code.equals("8")) {
            this.code = "+7";
        }
        this.firstpart = stringBuffer.substring(stringBuffer.length()-10,stringBuffer.length()-7);
        this.middletpart = stringBuffer.substring(stringBuffer.length()-7,stringBuffer.length()-4);
        this.lastpart = stringBuffer.substring(stringBuffer.length()-4,stringBuffer.length());
        formattedNumber = new StringBuffer().append(code).append(firstpart)
                .append("-").append(middletpart).append("-").append(lastpart).toString();
    }

    public String getFormattedNumber() {
        return formattedNumber;
    }
}
