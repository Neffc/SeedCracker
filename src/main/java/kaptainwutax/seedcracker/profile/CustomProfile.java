package kaptainwutax.seedcracker.profile;

public abstract class CustomProfile extends FinderProfile {

	public CustomProfile(String author, boolean defaultState) {
		super(defaultState);
		this.author = "Neffc";
		this.locked = false;

		this.setTypeState(Finder.Type.BIOME, false);

		this.setTypeState(Finder.Type.BURIEDTREASURE, false);
		this.setTypeState(Finder.Type.DESERTPYRAMID, false);
		this.setTypeState(Finder.Type.ENDCITY, false);
		this.setTypeState(Finder.Type.IGLOO, false);
		this.setTypeState(Finder.Type.JUNGLEPYRAMID, false);
		this.setTypeState(Finder.Type.MANSION, false);
		this.setTypeState(Finder.Type.MONUMENT, false);
		this.setTypeState(Finder.Type.SHIPWRECK, false);
		this.setTypeState(Finder.Type.SWAMPHUT, false);

		this.setTypeState(Finder.Type.DESERTWELL, false);
		this.setTypeState(Finder.Type.DUNGEON, false);
		this.setTypeState(Finder.Type.ENDPILLARS, false);

		this.setTypeState(Finder.Type.ANCIENTDEBRIS, false);
		this.setTypeState(Finder.Type.DIAMONDORE, false);
		this.setTypeState(Finder.Type.EMERALDORE, false);

	}

}
