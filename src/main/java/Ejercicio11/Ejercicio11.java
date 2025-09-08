
package Ejercicio11;


public class Ejercicio11 {
    public static void main(String[] args) {
        PlataformaStreaming[] plataformas = new PlataformaStreaming[3];
        plataformas[0] = new Netflix();
        plataformas[1] = new Youtube();
        plataformas[2] = new Netflix();

        String[] seriesNetflix = {"Serie 1", "serie 2", "Serie 3"};
        String[] videosYoutube = {"Video 1", "Video 2", "Video 3"};
     
        for (PlataformaStreaming p : plataformas) {
            if(p instanceof Netflix){
                for(String serie: seriesNetflix){
                    p.reproducirContenido(serie);
                }
            }else{
                for(String video: videosYoutube){
                    p.reproducirContenido(video);
                }
            }
        }
    }

}


