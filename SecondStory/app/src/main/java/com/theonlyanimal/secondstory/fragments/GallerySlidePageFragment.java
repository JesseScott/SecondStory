package com.theonlyanimal.secondstory.fragments;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.theonlyanimal.secondstory.R;


public class GallerySlidePageFragment extends Fragment {

    public static final String ARG_PAGE = "page";
    private int mPageNumber;

    public static GallerySlidePageFragment create(int pageNumber) {
        GallerySlidePageFragment fragment = new GallerySlidePageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, pageNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public GallerySlidePageFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout containing a title and body text.
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.gallery_page_layout, container, false);

        // Set the title view to show the page number.
        ((TextView) rootView.findViewById(android.R.id.text1)).setText(getString(R.string.title_template_step, mPageNumber + 1));

        return rootView;
    }

    public int getPageNumber() {
        return mPageNumber;
    }
}
