package com.example.layouts;

import com.example.layouts.slice.MainAbility2Slice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class MainAbility2 extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbility2Slice.class.getName());
    }
}
