package com.jose.navigationcomponentexample

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

public class FirstFragmentDirections private constructor() {
  private data class ActionFirstFragmentToSecondFragment(
    public val name: String = "Guest",
  ) : NavDirections {
    public override val actionId: Int = R.id.action_firstFragment_to_secondFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("name", this.name)
        return result
      }
  }

  public companion object {
    public fun actionFirstFragmentToSecondFragment(name: String = "Guest"): NavDirections =
        ActionFirstFragmentToSecondFragment(name)
  }
}
