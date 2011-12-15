/*
 *	This file is part of Transdroid <http://www.transdroid.org>
 *	
 *	Transdroid is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Transdroid is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Transdroid.  If not, see <http://www.gnu.org/licenses/>.
 *	
 */
 package org.transdroid.gui;

import java.util.List;

import org.transdroid.daemon.TorrentFile;
import org.transdroid.gui.util.SelectableArrayAdapter;

import android.view.View;
import android.view.ViewGroup;

/**
 * An adapter that can be mapped to a list of torrent files.
 * @author erickok
 *
 */
public class TorrentFileListAdapter extends SelectableArrayAdapter<TorrentFile> {

	public TorrentFileListAdapter(DetailsFragment detailsActivity, List<TorrentFile> torrents) {
		super(detailsActivity.getActivity(), torrents, detailsActivity);
	}
	
	public View getView(int position, View convertView, ViewGroup paret, boolean selected) {
		// TODO: Try to reuse the convertView for better performance
		return new TorrentFileListView(getContext(), this, getItem(position), selected);
	}

}
