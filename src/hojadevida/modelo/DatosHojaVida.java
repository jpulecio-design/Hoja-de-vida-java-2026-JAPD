package hojadevida.modelo;

/**
 * Modelo de datos para la Hoja de Vida.
 */
public class DatosHojaVida {

    // ========== PERSONALIZA TUS DATOS AQUÍ ==========
    private String nombre = "Juan Andres Pulecio";
    private String titulo = "Tecnologo en desarrollo de Software";
    private String ciudad = "Popayán, Colombia";
    private String telefono = "+57 312 613 8823";
    private String email = "jpulecio@unimayor.edu.co";
    private String github = "github.com/jpulecio-diseño";
    private String[] habilidadesTecnicas = {"Java", "Git y GitHub", "Programación", "Estructura de Datos"};
    private String[] habilidadesBlandas = {"Trabajo en equipo", "Comunicación", "Resolución de problemas"};
    private String idiomas = "Español - Nativo\nEnglish - Básico (B2)";
    private String perfil = "El Tecnólogo en Desarrollo de Software es un profesional capaz de analizar, diseñar y desarrollar sistemas informáticos, creando aplicaciones dinámicas con programación orientada a objetos. Puede integrarse en equipos de trabajo, apoyar en la administración de redes y liderar procesos tecnológicos con pensamiento crítico, creatividad y buena adaptación al entorno laboral.";
    private String experiencia = "2024-2025\n[Product Manager, Scrum Master] - [Unimayor]\n[Popayán]";
    private String educacion = "2020-2025\n[Tecnólogo en Desarrollo de Software] - [Colegio Mayor del cauca]\n[Popayán]";
    private String[] areasInteres = {"Estructura de Datos", "Algoritmos", "Ingeniería de Software, Inteligencia Artificial"};
    private String proyectos = "• AssemblyLab - Proyecto acerca de ensamblar computadoras basado en la website de PCPartPicket, tecnologias usadas, java, json y la plataforma de desarrollo netbeans";
    // =================================================

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getGithub() { return github; }
    public void setGithub(String github) { this.github = github; }
    public String[] getHabilidadesTecnicas() { return habilidadesTecnicas; }
    public void setHabilidadesTecnicas(String[] h) { this.habilidadesTecnicas = h; }
    public String[] getHabilidadesBlandas() { return habilidadesBlandas; }
    public void setHabilidadesBlandas(String[] h) { this.habilidadesBlandas = h; }
    public String getIdiomas() { return idiomas; }
    public void setIdiomas(String idiomas) { this.idiomas = idiomas; }
    public String getPerfil() { return perfil; }
    public void setPerfil(String perfil) { this.perfil = perfil; }
    public String getExperiencia() { return experiencia; }
    public void setExperiencia(String exp) { this.experiencia = exp; }
    public String getEducacion() { return educacion; }
    public void setEducacion(String ed) { this.educacion = ed; }
    public String[] getAreasInteres() { return areasInteres; }
    public void setAreasInteres(String[] a) { this.areasInteres = a; }
    public String getProyectos() { return proyectos; }
    public void setProyectos(String p) { this.proyectos = p; }

    public String getHabilidadesTecnicasFormateadas() {
        return "• " + String.join("\n• ", habilidadesTecnicas);
    }
    public String getHabilidadesBlandasFormateadas() {
        return "• " + String.join("\n• ", habilidadesBlandas);
    }
    public String getAreasInteresFormateadas() {
        return "• " + String.join("\n• ", areasInteres);
    }
}
