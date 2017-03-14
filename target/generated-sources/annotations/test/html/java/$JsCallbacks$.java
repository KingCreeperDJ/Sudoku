package test.html.java;
public final class $JsCallbacks$ {
  static final $JsCallbacks$ VM = new $JsCallbacks$(null);
  private final org.apidesign.html.boot.spi.Fn.Presenter p;
  private $JsCallbacks$ last;
  private $JsCallbacks$(org.apidesign.html.boot.spi.Fn.Presenter p) {
    this.p = p;
  }
  final $JsCallbacks$ current() {
    org.apidesign.html.boot.spi.Fn.Presenter now = org.apidesign.html.boot.spi.Fn.activePresenter();
    if (now == p) return this;
    if (last != null && now == last.p) return last;
    return last = new $JsCallbacks$(now);
  }

  public java.lang.Object java_lang_Runnable$run$(java.lang.Runnable self) throws Throwable {
    try (java.io.Closeable a = org.apidesign.html.boot.spi.Fn.activate(p)) { 
    self.run();
    return null;
    }
  }
}
