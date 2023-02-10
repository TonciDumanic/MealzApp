package hr.dumanic.tonci.mealzapp.ui

import androidx.lifecycle.ViewModel
import hr.dumanic.tonci.model.MealsRepository
import hr.dumanic.tonci.model.response.MealsCategoriesResponse


class MealsCategoriesViewModel (private val repository: MealsRepository = MealsRepository()): ViewModel() {
    fun getMeals(successCallback: (response: MealsCategoriesResponse?) -> Unit) {
        repository.getMeals { response ->
            successCallback(response)
        }
    }
}