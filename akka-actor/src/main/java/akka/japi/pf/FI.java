/**
 * Copyright (C) 2009-2016 Typesafe Inc. <http://www.typesafe.com>
 */

package akka.japi.pf;

/**
 * Class that encapsulates all the Functional Interfaces
 * used for creating partial functions.
 *
 * This is an EXPERIMENTAL feature and is subject to change until it has received more real world testing.
 */
public final class FI {
  private FI() {
  }

  /**
   * Functional interface for an application.
   *
   * @param <I> the input type, that this Apply will be applied to
   * @param <R> the return type, that the results of the application will have
   */
  public static interface Apply<I, R> {
    /**
     * The application to perform.
     *
     * @param i  an instance that the application is performed on
     * @return  the result of the application
     */
    public R apply(I i) throws Exception;
  }

  /**
   * Functional interface for an application.
   *
   * @param <I1> the first input type, that this Apply will be applied to
   * @param <I2> the second input type, that this Apply will be applied to
   * @param <R> the return type, that the results of the application will have
   */
  public static interface Apply2<I1, I2, R> {
    /**
     * The application to perform.
     *
     * @param i1  an instance that the application is performed on
     * @param i2  an instance that the application is performed on
     * @return  the result of the application
     */
    public R apply(I1 i1, I2 i2) throws Exception;
  }

  /**
   * Functional interface for a predicate.
   *
   * @param <T> the type that the predicate will operate on.
   */
  public static interface TypedPredicate<T> {
    /**
     * The predicate to evaluate.
     *
     * @param t  an instance that the predicate is evaluated on.
     * @return  the result of the predicate
     */
    public boolean defined(T t);
  }

  /**
   * Functional interface for a predicate.
   *
   * @param <T> the type that the predicate will operate on.
   * @param <U> the type that the predicate will operate on.
   */
  public static interface TypedPredicate2<T, U> {
    /**
     * The predicate to evaluate.
     *
     * @param t  an instance that the predicate is evaluated on.
     * @param u  an instance that the predicate is evaluated on.
     * @return  the result of the predicate
     */
    public boolean defined(T t, U u);
  }

  /**
   * Functional interface for an application.
   *
   * @param <I> the input type, that this Apply will be applied to
   */
  public static interface UnitApply<I> {
    /**
     * The application to perform.
     *
     * @param i  an instance that the application is performed on
     */
    public void apply(I i) throws Exception;
  }

  /**
   * Functional interface for an application.
   *
   * @param <I1> the first input type, that this Apply will be applied to
   * @param <I2> the second input type, that this Apply will be applied to
   */
  public static interface UnitApply2<I1, I2> {
    /**
     * The application to perform.
     *
     * @param i1  an instance that the application is performed on
     * @param i2  an instance that the application is performed on
     */
    public void apply(I1 i1, I2 i2) throws Exception;
  }

  /**
   * Functional interface for an application.
   *
   * @param <I1> the first input type, that this Apply will be applied to
   * @param <I2> the second input type, that this Apply will be applied to
   * @param <I3> the third input type, that this Apply will be applied to
   */
  public static interface UnitApply3<I1, I2, I3> {
    /**
     * The application to perform.
     *
     * @param i1  an instance that the application is performed on
     * @param i2  an instance that the application is performed on
     * @param i3  an instance that the application is performed on
     */
    public void apply(I1 i1, I2 i2, I3 i3) throws Exception;
  }

  /**
   * Functional interface for an application.
   *
   * @param <I1> the first input type, that this Apply will be applied to
   * @param <I2> the second input type, that this Apply will be applied to
   * @param <I3> the third input type, that this Apply will be applied to
   * @param <I4> the fourth input type, that this Apply will be applied to
   */
  public static interface UnitApply4<I1, I2, I3, I4> {
    /**
     * The application to perform.
     *
     * @param i1 an instance that the application is performed on
     * @param i2 an instance that the application is performed on
     * @param i3 an instance that the application is performed on
     * @param i4 an instance that the application is performed on
     */
    public void apply(I1 i1, I2 i2, I3 i3, I4 i4) throws Exception;
  }

  /**
   * Functional interface for an application.
   */
  public static interface UnitApplyVoid {
    /**
     * The application to perform.
     */
    public void apply() throws Exception;
  }

  /**
   * Package scoped functional interface for a predicate. Used internally to match against arbitrary types.
   */
  static interface Predicate {
    /**
     * The predicate to evaluate.
     *
     * @param o  an instance that the predicate is evaluated on.
     * @return  the result of the predicate
     */
    public boolean defined(Object o);
  }


}
