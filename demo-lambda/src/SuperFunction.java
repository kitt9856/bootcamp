@FunctionalInterface
public interface  SuperFunction<T,U,V,R>{
  R apply(T t,U u,V v);  //return R 
}
