package com.jose.navigationcomponentexample

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class SecondFragmentDirections private constructor() {
  public companion object {
    public fun actionSecondFragmentToThirdFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_secondFragment_to_thirdFragment2)
  }
}
