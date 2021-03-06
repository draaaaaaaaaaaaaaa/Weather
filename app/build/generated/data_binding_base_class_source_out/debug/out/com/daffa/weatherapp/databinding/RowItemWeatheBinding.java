// Generated by view binder compiler. Do not edit!
package com.daffa.weatherapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.daffa.weatherapp.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RowItemWeatheBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ImageView imgItemWeather;

  @NonNull
  public final TextView tvItemDate;

  @NonNull
  public final TextView tvItemTime;

  @NonNull
  public final TextView tvMaxDegree;

  @NonNull
  public final TextView tvMinDegree;

  private RowItemWeatheBinding(@NonNull MaterialCardView rootView,
      @NonNull ImageView imgItemWeather, @NonNull TextView tvItemDate, @NonNull TextView tvItemTime,
      @NonNull TextView tvMaxDegree, @NonNull TextView tvMinDegree) {
    this.rootView = rootView;
    this.imgItemWeather = imgItemWeather;
    this.tvItemDate = tvItemDate;
    this.tvItemTime = tvItemTime;
    this.tvMaxDegree = tvMaxDegree;
    this.tvMinDegree = tvMinDegree;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static RowItemWeatheBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowItemWeatheBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_item_weathe, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowItemWeatheBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img_item_weather;
      ImageView imgItemWeather = ViewBindings.findChildViewById(rootView, id);
      if (imgItemWeather == null) {
        break missingId;
      }

      id = R.id.tv_item_date;
      TextView tvItemDate = ViewBindings.findChildViewById(rootView, id);
      if (tvItemDate == null) {
        break missingId;
      }

      id = R.id.tv_item_time;
      TextView tvItemTime = ViewBindings.findChildViewById(rootView, id);
      if (tvItemTime == null) {
        break missingId;
      }

      id = R.id.tv_max_degree;
      TextView tvMaxDegree = ViewBindings.findChildViewById(rootView, id);
      if (tvMaxDegree == null) {
        break missingId;
      }

      id = R.id.tv_min_degree;
      TextView tvMinDegree = ViewBindings.findChildViewById(rootView, id);
      if (tvMinDegree == null) {
        break missingId;
      }

      return new RowItemWeatheBinding((MaterialCardView) rootView, imgItemWeather, tvItemDate,
          tvItemTime, tvMaxDegree, tvMinDegree);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
