public class Data {
    int dia;
    int mes;
    int ano;

    //

    public String formatarData(int dia, int mes, int ano){
        return dia+"/"+mes+"/"+ano;
    }

    Data (int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

}
