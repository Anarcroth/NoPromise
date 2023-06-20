package org.lambafactory.promise;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class NoPromise {

	/**
	 * Shorthand for {@link CompletableFuture#completedFuture(Object)}.
	 * @param t The value to complete.
	 * @return A Completable Future, completed with the passed value.
	 * @param <T> The type of the passed value.
	 */
	public static <T> CompletableFuture<T> completed(T t) {
		return CompletableFuture.completedFuture(t);
	}

	public static <T> CompletableFuture<T> non() {
		return completed(null);
	}

	public static <T> CompletableFuture<Optional<T>> empty() {
		return completed(Optional.empty());
	}

	public static <T> CompletableFuture<T> fail(Throwable e) {
		CompletableFuture<T> cf = new CompletableFuture<>();
		cf.completeExceptionally(e);
		return cf;
	}
}
