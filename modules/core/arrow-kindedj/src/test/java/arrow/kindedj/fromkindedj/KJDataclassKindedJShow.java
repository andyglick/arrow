package arrow.kindedj.fromkindedj;

import arrow.kindedj.*;
import io.kindedj.*;

public class KJDataclassKindedJShow implements KindedJShow<ForKJDataclass> {
    public static KJDataclassKindedJShow INSTANCE = new KJDataclassKindedJShow();

    private KJDataclassKindedJShow() {
    }

    @Override
    public <A> String show(Hk<ForKJDataclass, A> hk) {
        return ForKJDataclass.show(hk);
    }
}
