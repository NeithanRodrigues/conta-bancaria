package br.com.caelum.contas.modelo;

public class Data {
    public int dia;
    public int mes;
    public int ano;

    //

    public String formatarData(int dia, int mes, int ano){
        return dia+"/"+mes+"/"+ano;
    }

    public Data (int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

}