/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testalista;

/**
 *
 * @author alber
 */
public class Contato {

    private String nome, endereco;
    private long cpf;

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public long getCpf() {
        return cpf;
    }

    public Contato(String n, String e, long c) {
        nome = n;
        endereco = e;
        cpf = c;
    }

    public String getContato() {
        String aux = nome + "\n" + endereco + "\n" + Long.toString(cpf) + "\n";
        return aux;
    }
}
