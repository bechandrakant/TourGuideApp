package ml.chandrakant.tourguideapp;

/**
 *  {@link FragmentItem} represents an attraction of Kota city.
 *  It contains name and location for each attraction.
 */
public class FragmentItem {

    /** Name of Attraction */
    private String mAttractionName;

    /** Location of Attraction */
    private String mAttractionLocation;

    /** Drawable image resource to represent words */
    private int mImageResource = NO_IMAGE_PROVIDED;

    /** Event Date */
    private String mEventDate = "";

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Creates a new FragmentItem object to represent Coachings and Restaurants.
     *
     * @param mAttractionName is an event name in kota city.
     * @param mAttractionLocation is location of that event.
     */
    public FragmentItem(String mAttractionName, String mAttractionLocation) {
        this.mAttractionName = mAttractionName;
        this.mAttractionLocation = mAttractionLocation;
    }

    /**
     * Creates a new FragmentItem object to represent Events.
     *
     * @param mEventName is an event name in kota city.
     * @param mEventLocation is location of that event.
     * @param mEventDate is date of the event (eg: 10th Dec).
     */
    public FragmentItem(String mEventName, String mEventLocation, String mEventDate) {
        this.mAttractionName = mEventName;
        this.mAttractionLocation = mEventLocation;
        this.mEventDate = mEventDate;
    }

    /**
     * Creates a new FragmentItem object to represent tourism Attractions.
     *
     * @param mAttractionName is a tourism destination name in a city.
     * @param mAttractionLocation is a tourism destination location in a city.
     * @param mImageResource is the drawable image resource.
     */
    public FragmentItem(String mAttractionName, String mAttractionLocation, int mImageResource) {
        this.mAttractionName = mAttractionName;
        this.mAttractionLocation = mAttractionLocation;
        this.mImageResource = mImageResource;
    }

    /** Get Attraction name */
    public String getAttractionName() {
        return mAttractionName;
    }

    /** Get Attraction Location */
    public String getAttractionLocation() {
        return mAttractionLocation;
    }

    /** Get Drawable image resource to represent words */
    public int getImageResource() {
        return mImageResource;
    }

    /** Checks if image resource is provided or not */
    public boolean hasImage () {
        return mImageResource != NO_IMAGE_PROVIDED;
    }

    /** Gets Event date */
    public String getEventDate () {
        return mEventDate;
    }

    /** Checks if image resource is provided or not */
    public boolean hasDate () {
        return !mEventDate.equals("");
    }
}
