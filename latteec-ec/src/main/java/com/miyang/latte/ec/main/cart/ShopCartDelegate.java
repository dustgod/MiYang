package com.miyang.latte.ec.main.cart;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.miyang.latte.delegates.bottom.BottomItemDelegate;
import com.miyang.latte.ec.R;

/**
 * Created by 刘合鹏
 */

public class ShopCartDelegate extends BottomItemDelegate {


    @Override
    public Object setLayout() {
        return R.layout.delegate_shop_cart;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {

    }
}
