package leidens.cristian.clientstableconfig.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author Cristian
 * @version 1.0.0
 * @since 16/06/2020
 * @category Model
 */
//Lombok
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

//Springboot
@Component

//JPA
@Entity
@Table(name = "client")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private long id;

    @Column(name = "name")
    @NotBlank(message = "Invalid name")
    private String name;

    @Column(name = "age")
    @NotNull(message = "Can't age empty")
    private int age;

    @Column(name = "cpf")
    @NotBlank(message = "Invalid CPF")
    private String cpf;

    @Column(name = "email")
    @NotBlank(message = "Invalid email")
    private String email;

    @Column(name = "phone")
    @NotNull(message = "Invalid phone")
    private int phone;

    @Column(name = "save")
    @NotNull(message = "Data local")
    private String save;
}