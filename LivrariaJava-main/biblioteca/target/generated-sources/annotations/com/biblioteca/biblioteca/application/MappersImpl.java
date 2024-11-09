package com.biblioteca.biblioteca.application;

import com.biblioteca.biblioteca.domain.dto.LivroDTO;
import com.biblioteca.biblioteca.domain.dto.UsuarioDTO;
import com.biblioteca.biblioteca.domain.entity.Livro;
import com.biblioteca.biblioteca.domain.entity.Usuario;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-08T19:59:26-0300",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 3.40.0.z20241023-1306, environment: Java 17.0.13 (Eclipse Adoptium)"
)
@Component
public class MappersImpl implements Mappers {

    @Override
    public UsuarioDTO UsuariotoDto(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setDataCadastro( usuario.getDataCadastro() );
        usuarioDTO.setEmail( usuario.getEmail() );
        usuarioDTO.setId( usuario.getId() );
        usuarioDTO.setNome( usuario.getNome() );
        usuarioDTO.setQuantidadeLivrosEmprestados( usuario.getQuantidadeLivrosEmprestados() );

        return usuarioDTO;
    }

    @Override
    public Usuario UsuarioDTOtoEntity(UsuarioDTO usuarioDTO) {
        if ( usuarioDTO == null ) {
            return null;
        }

        Usuario.UsuarioBuilder usuario = Usuario.builder();

        usuario.dataCadastro( usuarioDTO.getDataCadastro() );
        usuario.email( usuarioDTO.getEmail() );
        usuario.id( usuarioDTO.getId() );
        usuario.nome( usuarioDTO.getNome() );
        usuario.quantidadeLivrosEmprestados( usuarioDTO.getQuantidadeLivrosEmprestados() );

        return usuario.build();
    }

    @Override
    public LivroDTO livrtoDto(Livro livro) {
        if ( livro == null ) {
            return null;
        }

        LivroDTO livroDTO = new LivroDTO();

        livroDTO.setAnoPublicacao( livro.getAnoPublicacao() );
        livroDTO.setAutor( livro.getAutor() );
        livroDTO.setDisponibilidade( livro.isDisponibilidade() );
        livroDTO.setEditora( livro.getEditora() );
        if ( livro.getId() != null ) {
            livroDTO.setId( livro.getId() );
        }
        livroDTO.setTitulo( livro.getTitulo() );

        return livroDTO;
    }

    @Override
    public Livro LivroDTOtoEntity(LivroDTO livbroDTO) {
        if ( livbroDTO == null ) {
            return null;
        }

        Livro.LivroBuilder livro = Livro.builder();

        livro.anoPublicacao( livbroDTO.getAnoPublicacao() );
        livro.autor( livbroDTO.getAutor() );
        livro.disponibilidade( livbroDTO.isDisponibilidade() );
        livro.editora( livbroDTO.getEditora() );
        livro.id( livbroDTO.getId() );
        livro.titulo( livbroDTO.getTitulo() );

        return livro.build();
    }
}
