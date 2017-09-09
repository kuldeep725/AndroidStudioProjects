package com.masterview.kunal.masterview.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 3;
    private static int counter = 1;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        String name;
        if(position == 1) {
            name = "Google";
        }
        else if(position == 2) {
            name = "Facebook";
        }
        else if (position == 3) {
            name = "Cricbuzz";
        }
        else {
            name = "None";
        }
        return new DummyItem(Integer.toString(counter++), name, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
            if(position == 1) {
                builder.append("https://www.google.com/gmail/");
            }
            else if(position == 2) {
                builder.append("https://www.thenewboston.com/forum/");
            }
            else if (position == 3) {
                builder.append("https://www.cricbuzz.com");
            }

        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String itemName;
        public final String url;

        public DummyItem(String id, String itemName, String url) {
            this.id = id;
            this.itemName = itemName;
            this.url = url;
        }

        @Override
        public String toString() {
            return itemName;
        }
    }
}
