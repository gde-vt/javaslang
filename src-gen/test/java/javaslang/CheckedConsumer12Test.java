/*     / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javaslang;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class CheckedConsumer12Test {

    @Test
    public void shouldGetArity() {
        final CheckedConsumer12<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> f = (o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12) -> {};
        assertThat(f.arity()).isEqualTo(12);
    }

    @Test
    public void shouldCurry() {
        final CheckedConsumer12<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> f = (o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12) -> {};
        final CheckedFunction1<Object, CheckedFunction1<Object, CheckedFunction1<Object, CheckedFunction1<Object, CheckedFunction1<Object, CheckedFunction1<Object, CheckedFunction1<Object, CheckedFunction1<Object, CheckedFunction1<Object, CheckedFunction1<Object, CheckedFunction1<Object, CheckedConsumer1<Object>>>>>>>>>>>> curried = f.curried();
        assertThat(curried).isNotNull();
    }

    @Test
    public void shouldTuple() {
        final CheckedConsumer12<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> f = (o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12) -> {};
        final CheckedConsumer1<Tuple12<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object>> tupled = f.tupled();
        assertThat(tupled).isNotNull();
    }

    @Test
    public void shouldReverse() {
        final CheckedConsumer12<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> f = (o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12) -> {};
        assertThat(f.reversed()).isNotNull();
    }

    @Test
    public void shouldComposeWithAndThen() {
        final CheckedConsumer12<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> f = (o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12) -> {};
        final CheckedConsumer12<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> after = (o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12) -> {};
        final CheckedConsumer12<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> composed = f.andThen(after);
        assertThat(composed).isNotNull();
    }

    @Test
    public void shouldComposeWithCompose() {
        final CheckedConsumer12<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> f = (o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12) -> {};
        final CheckedConsumer12<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> before = (o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12) -> {};
        final CheckedConsumer12<Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object, Object> composed = f.compose(before);
        assertThat(composed).isNotNull();
    }
}