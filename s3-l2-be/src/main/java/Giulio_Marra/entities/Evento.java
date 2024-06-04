package Giulio_Marra.entities;


import Giulio_Marra.enums.TipoEvento;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "eventi")
public class Evento {
    @Id
    @GeneratedValue

    private long id;

    @Column(name = "titolo")
    private String titoloEventp;
    @Column(name = "data_evento")
    private Date dataEevento;
    @Column(name = "descrizione")
    private String descrizioneEvento;
    @Column(name = "tipo_evento")
    @Enumerated(EnumType.STRING)
    private TipoEvento tipoevento;

    public Evento() {

    }

    public Evento(String titoloEventp, Date dataEevento, String descrizioneEvento, TipoEvento tipoevento) {
        this.titoloEventp = titoloEventp;
        this.dataEevento = dataEevento;
        this.descrizioneEvento = descrizioneEvento;
        this.tipoevento = tipoevento;
    }

    public long getId() {
        return id;
    }

    public String getTitoloEventp() {
        return titoloEventp;
    }

    public void setTitoloEventp(String titoloEventp) {
        this.titoloEventp = titoloEventp;
    }

    public Date getDataEevento() {
        return dataEevento;
    }

    public void setDataEevento(Date dataEevento) {
        this.dataEevento = dataEevento;
    }

    public String getDescrizioneEvento() {
        return descrizioneEvento;
    }

    public void setDescrizioneEvento(String descrizioneEvento) {
        this.descrizioneEvento = descrizioneEvento;
    }

    public TipoEvento getTipoevento() {
        return tipoevento;
    }

    public void setTipoevento(TipoEvento tipoevento) {
        this.tipoevento = tipoevento;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titoloEventp='" + titoloEventp + '\'' +
                ", dataEevento=" + dataEevento +
                ", descrizioneEvento='" + descrizioneEvento + '\'' +
                ", tipoevento=" + tipoevento +
                '}';
    }
}
