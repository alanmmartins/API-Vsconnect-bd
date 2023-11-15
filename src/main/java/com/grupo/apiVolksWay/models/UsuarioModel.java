package com.grupo.apiVolksWay.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.io.Serial;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.Date;
@Getter
@Setter
@Entity
@Table(name = "tb_usuarios")
public class UsuarioModel implements Serializable, UserDetails {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_usuario", nullable = false)
    private UUID id;

    private String nome;
    private String telefone;
    private String email;
    private String senha;
    private Date data_nascimento;
    private String cidade;
    private String cpf;

    private TipoModel tipo_usuario;
    private String UrlImagem;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (this.tipo_usuario == TipoModel.ADMIN) {
            return List.of(
                    new SimpleGrantedAuthority("ROLE_ADMIN"),
                    new SimpleGrantedAuthority("ROLE_MOTORISTA"),
                    new SimpleGrantedAuthority("ROLE_PROPRIETARIO"),
                    new SimpleGrantedAuthority("ROLE_ADMFROTA")
            );
        }else if (this.tipo_usuario == TipoModel.MOTORISTA) {
                    return List.of(
                            new SimpleGrantedAuthority("ROLE_MOTORISTA")
                    );

        }else if (this.tipo_usuario == TipoModel.MOTORISTA) {
            return List.of(
                    new SimpleGrantedAuthority("ROLE_PROPRIETARIO")
            );
        }else if (this.tipo_usuario == TipoModel.MOTORISTA) {
            return List.of(
                    new SimpleGrantedAuthority("ROLE_ADMFROTA")
            );
        }
        return null;
    }
    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return email;
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