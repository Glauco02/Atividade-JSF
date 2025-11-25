package br.com.cadUser;

import java.io.Serializable;
import java.util.ArrayList;

// Importações novas (CDI) em vez de javax.faces.bean
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named // Substitui o @ManagedBean
@RequestScoped
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    // Atributos solicitados
    private String nome;
    private ArrayList<String> nomes = new ArrayList<>();

    // Construtor vazio (boa prática)
    public Pessoa() {
    }

    // --- Getters e Setters ---

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getNomes() {
        return nomes;
    }

    public void setNomes(ArrayList<String> nomes) {
        this.nomes = nomes;
    }
}