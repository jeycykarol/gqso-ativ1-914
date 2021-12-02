package app;

import io.jooby.Jooby;

public class App extends Jooby {

  {
    //Rotas:
    mvc(new Controller());
    mvc(new RaizQuadrada());
    mvc(new Soma());
    mvc(new Subtracao());
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
