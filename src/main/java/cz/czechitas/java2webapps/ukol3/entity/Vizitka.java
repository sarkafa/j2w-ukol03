package cz.czechitas.java2webapps.ukol3.entity;

public class Vizitka {
    private String jmeno;
    private String firma;
    private String ulice;
    private String obecPsc;
    private String celaAdresa;
    private String email;
    private Integer telefon;
    private String web;

    public Vizitka () {}  // bezparametricky konstruktor

    public Vizitka(String jmeno, String firma, String ulice, String obecPsc,
                   String email, Integer telefon, String web) {
        this.jmeno = jmeno;
        this.firma = firma;
        this.ulice = ulice;
        this.obecPsc = obecPsc;
        this.email = email;
        this.telefon = telefon;
        this.web = web;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public String getObecPsc() {
        return obecPsc;
    }

    public void setObecPsc(String obecPsc) {
        this.obecPsc = obecPsc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefon() {
        return telefon;
    }

    public void setTelefon(Integer telefon) {
        this.telefon = telefon;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getCelaAdresa () {
        return ulice + ", " + obecPsc;
    }
}
