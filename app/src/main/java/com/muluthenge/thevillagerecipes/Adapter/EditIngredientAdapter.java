package com.muluthenge.thevillagerecipes.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textfield.TextInputEditText;
import com.muluthenge.thevillagerecipes.Activity.EditMyRecipeActivity;
import com.muluthenge.thevillagerecipes.Model.Ingredient;
import com.muluthenge.thevillagerecipes.R;

import java.util.ArrayList;
import java.util.List;

public class EditIngredientAdapter extends RecyclerView.Adapter<EditIngredientAdapter.IngredientsHolder> {

    private List<Ingredient> ingredients;
    public EditIngredientAdapter(List<Ingredient> ingredientList){
        this.ingredients = ingredientList;
    }

    public EditIngredientAdapter(EditMyRecipeActivity editMyRecipeActivity, ArrayList<Object> quickArrayList) {
    }

    @NonNull
    @Override
    public IngredientsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.single_edit_ingredient,parent,false);
        return new EditIngredientAdapter.IngredientsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IngredientsHolder holder, int position) {
        Ingredient ingredient = ingredients.get(position);
//        holder.ingredientName.setText(Ingredient.ingredientName);
//        holder.ingredientQua.setText(Ingredient.ingredientQua);

    }

    @Override
    public int getItemCount() {
        return ingredients.size();
    }

    public class IngredientsHolder extends RecyclerView.ViewHolder{

        TextInputEditText ingredientName,ingredientQua;
        public IngredientsHolder(@NonNull View itemView) {
            super(itemView);
            ingredientName = itemView.findViewById(R.id.edit_ingredients_name);
            ingredientQua = itemView.findViewById(R.id.edit_ingredients_qua);
        }
    }

}
