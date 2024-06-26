package com.example.demo.service;

import java.util.Collection;
import java.util.List;

import com.example.demo.Model.Admin;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.Model.Aluno;

/*
 * Em uma aplicação Spring, as classes "Custom" geralmente indicam componentes personalizados que estendem ou implementam funcionalidades específicas.
 */

public class CustomAlunoDetail implements UserDetails {

    private Aluno aluno;


    public CustomAlunoDetail(Aluno aluno) {
        this.aluno = aluno;
    }

    /**
     * Esse método abaixo que é responsável por mapear as ROLES(regras de hierarquia)
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return List.of(new SimpleGrantedAuthority(aluno.getRole()));
    }

    public String getNome() {
        return aluno.getNome();
    }

    public String getTelefone() {
        return aluno.getTelefone();
    }

    public String getCpf() {
        return aluno.getCpf();
    }

    public String getCurso() {
        return aluno.getCurso();
    }

    public String getEmail() {
        return aluno.getEmail();
    }

    public String getNota() {
        return aluno.getNota();
    }

    public String getFalta() {
        return aluno.getFalta();
    }

    public String getProfessor() {
        return aluno.getProfessor();
    }

    public String getHorario() {
        return aluno.getHorario();
    }

    @Override
    public String getPassword() {
        return aluno.getSenha();
    }

    @Override
    public String getUsername() {
        return aluno.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
