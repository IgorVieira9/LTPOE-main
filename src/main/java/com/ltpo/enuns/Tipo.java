package com.ltpo.enuns;

public enum Tipo {
    MECANICO,
    CLIENTE
}
public class Usuario{
    @enumerated(EnumType.STRING)
    @Column(name="tipo-usuario",nullable=false)
    private Tipo tipo;
}
