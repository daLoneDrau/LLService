package com.osrapi.models.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author drau
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Entity
@Table(name = "io_npc_data", schema = "ll")
public final class LLIoNpcDataEntity {
    /**
     * the primary key - an autogenerated id (unique for each user in the db).
     */
    @Id
    @Column(name = "io_npc_data_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
  generator = "io_npc_data_seq")
    @SequenceGenerator(
        name = "io_npc_data_seq",
        sequenceName = "ll.io_npc_data_id_seq",
        allocationSize = 1
    )
    private Long                    id;
    /** Creates a new instance of {@link LLIoNpcDataEntity}. */
    public LLIoNpcDataEntity() {
        super();
    }
    /**
     * Gets the id.
     * @return {@link Long}
     */
    public Long getId() {
        return id;
    }
    /**
     * Sets the id.
     * @param val the new value
     */
    public void setId(final Long val) {
        id = val;
    }

    /** the xpvalue. */
    @Column(name = "xpvalue")
    @JsonProperty("xpvalue")
    
    private Long                    xpvalue;
    /**
     * Gets the xpvalue.
     * @return {@link Long}
     */
    public Long getXpvalue() {
        return xpvalue;
    }
    /**
     * Sets the xpvalue.
     * @param val the new value
     */
    public void setXpvalue(final Long val) {
        xpvalue = val;
    }

    /** the weapon. */
    @Column(name = "weapon")
    @JsonProperty("weapon")
    
    private String                    weapon;
    /**
     * Gets the weapon.
     * @return {@link String}
     */
    public String getWeapon() {
        return weapon;
    }
    /**
     * Sets the weapon.
     * @param val the new value
     */
    public void setWeapon(final String val) {
        weapon = val;
    }

    /** the title. */
    @Column(name = "title")
    @JsonProperty("title")
    @NotNull
    private String                    title;
    /**
     * Gets the title.
     * @return {@link String}
     */
    public String getTitle() {
        return title;
    }
    /**
     * Sets the title.
     * @param val the new value
     */
    public void setTitle(final String val) {
        title = val;
    }

    /** the savingThrow. */
    @Column(name = "saving_throw")
    @JsonProperty("saving_throw")
    
    private String                    savingThrow;
    /**
     * Gets the savingThrow.
     * @return {@link String}
     */
    public String getSavingThrow() {
        return savingThrow;
    }
    /**
     * Sets the savingThrow.
     * @param val the new value
     */
    public void setSavingThrow(final String val) {
        savingThrow = val;
    }

    /** the npcFlags. */
    @Column(name = "npc_flags")
    @JsonProperty("npc_flags")
    
    private Long                    npcFlags;
    /**
     * Gets the npcFlags.
     * @return {@link Long}
     */
    public Long getNpcFlags() {
        return npcFlags;
    }
    /**
     * Sets the npcFlags.
     * @param val the new value
     */
    public void setNpcFlags(final Long val) {
        npcFlags = val;
    }

    /** the numberAppearingInLair. */
    @ManyToOne(targetEntity = LLDiceEntity.class, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "numberAppearingInLair")
    @JsonProperty("num_appearing_in_lair")
  
    private LLDiceEntity    numberAppearingInLair;
    /**
     * Gets the numberAppearingInLair.
     * @return {@link LLDiceEntity}
     */
    public LLDiceEntity getNumberAppearingInLair() {
        return numberAppearingInLair;
    }
    /**
     * Sets the numberAppearingInLair.
     * @param val the new value
     */
    public void setNumberAppearingInLair(final LLDiceEntity val) {
        numberAppearingInLair = val;
    }

    /** the numberAppearing. */
    @ManyToOne(targetEntity = LLDiceEntity.class, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "numberAppearing")
    @JsonProperty("num_appearing")
  
    private LLDiceEntity    numberAppearing;
    /**
     * Gets the numberAppearing.
     * @return {@link LLDiceEntity}
     */
    public LLDiceEntity getNumberAppearing() {
        return numberAppearing;
    }
    /**
     * Sets the numberAppearing.
     * @param val the new value
     */
    public void setNumberAppearing(final LLDiceEntity val) {
        numberAppearing = val;
    }

    /** the name. */
    @Column(name = "name")
    @JsonProperty("name")
    @NotNull
    private String                    name;
    /**
     * Gets the name.
     * @return {@link String}
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the name.
     * @param val the new value
     */
    public void setName(final String val) {
        name = val;
    }

    /** the movePerTurn. */
    @Column(name = "move_per_turn")
    @JsonProperty("move_per_turn")
    
    private Long                    movePerTurn;
    /**
     * Gets the movePerTurn.
     * @return {@link Long}
     */
    public Long getMovePerTurn() {
        return movePerTurn;
    }
    /**
     * Sets the movePerTurn.
     * @param val the new value
     */
    public void setMovePerTurn(final Long val) {
        movePerTurn = val;
    }

    /** the movePerRound. */
    @Column(name = "move_per_round")
    @JsonProperty("move_per_round")
    
    private Long                    movePerRound;
    /**
     * Gets the movePerRound.
     * @return {@link Long}
     */
    public Long getMovePerRound() {
        return movePerRound;
    }
    /**
     * Sets the movePerRound.
     * @param val the new value
     */
    public void setMovePerRound(final Long val) {
        movePerRound = val;
    }

    /** the morale. */
    @Column(name = "morale")
    @JsonProperty("morale")
    
    private Long                    morale;
    /**
     * Gets the morale.
     * @return {@link Long}
     */
    public Long getMorale() {
        return morale;
    }
    /**
     * Sets the morale.
     * @param val the new value
     */
    public void setMorale(final Long val) {
        morale = val;
    }

    /** the module. */
    @Column(name = "module")
    @JsonProperty("module")
    
    private String                    module;
    /**
     * Gets the module.
     * @return {@link String}
     */
    public String getModule() {
        return module;
    }
    /**
     * Sets the module.
     * @param val the new value
     */
    public void setModule(final String val) {
        module = val;
    }

    /** the maxmana. */
    @Column(name = "maxmana")
    @JsonProperty("maxmana")
    
    private Float                    maxmana;
    /**
     * Gets the maxmana.
     * @return {@link Float}
     */
    public Float getMaxmana() {
        return maxmana;
    }
    /**
     * Sets the maxmana.
     * @param val the new value
     */
    public void setMaxmana(final Float val) {
        maxmana = val;
    }

    /** the maxlife. */
    @Column(name = "maxlife")
    @JsonProperty("maxlife")
    
    private Float                    maxlife;
    /**
     * Gets the maxlife.
     * @return {@link Float}
     */
    public Float getMaxlife() {
        return maxlife;
    }
    /**
     * Sets the maxlife.
     * @param val the new value
     */
    public void setMaxlife(final Float val) {
        maxlife = val;
    }

    /** the mana. */
    @Column(name = "mana")
    @JsonProperty("mana")
    
    private Float                    mana;
    /**
     * Gets the mana.
     * @return {@link Float}
     */
    public Float getMana() {
        return mana;
    }
    /**
     * Sets the mana.
     * @param val the new value
     */
    public void setMana(final Float val) {
        mana = val;
    }

    /** the life. */
    @Column(name = "life")
    @JsonProperty("life")
    
    private Float                    life;
    /**
     * Gets the life.
     * @return {@link Float}
     */
    public Float getLife() {
        return life;
    }
    /**
     * Sets the life.
     * @param val the new value
     */
    public void setLife(final Float val) {
        life = val;
    }

    /** the level. */
    @Column(name = "level")
    @JsonProperty("level")
    @NotNull
    private long                    level;
    /**
     * Gets the level.
     * @return {@link long}
     */
    public long getLevel() {
        return level;
    }
    /**
     * Sets the level.
     * @param val the new value
     */
    public void setLevel(final long val) {
        level = val;
    }

    /** the internalScript. */
    @Column(name = "internal_script")
    @JsonProperty("internal_script")
    
    private String                    internalScript;
    /**
     * Gets the internalScript.
     * @return {@link String}
     */
    public String getInternalScript() {
        return internalScript;
    }
    /**
     * Sets the internalScript.
     * @param val the new value
     */
    public void setInternalScript(final String val) {
        internalScript = val;
    }

    /** the icon. */
    @Column(name = "icon")
    @JsonProperty("icon")
    
    private String                    icon;
    /**
     * Gets the icon.
     * @return {@link String}
     */
    public String getIcon() {
        return icon;
    }
    /**
     * Sets the icon.
     * @param val the new value
     */
    public void setIcon(final String val) {
        icon = val;
    }

    /** the hoardClass. */
    @Column(name = "hoard_class")
    @JsonProperty("hoard_class")
    
    private Long                    hoardClass;
    /**
     * Gets the hoardClass.
     * @return {@link Long}
     */
    public Long getHoardClass() {
        return hoardClass;
    }
    /**
     * Sets the hoardClass.
     * @param val the new value
     */
    public void setHoardClass(final Long val) {
        hoardClass = val;
    }

    /** the gender. */
    @ManyToOne(targetEntity = LLGenderEntity.class, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "gender")
    @JsonProperty("gender")
  @NotNull
    private LLGenderEntity    gender;
    /**
     * Gets the gender.
     * @return {@link LLGenderEntity}
     */
    public LLGenderEntity getGender() {
        return gender;
    }
    /**
     * Sets the gender.
     * @param val the new value
     */
    public void setGender(final LLGenderEntity val) {
        gender = val;
    }

    /** the description. */
    @Column(name = "description")
    @JsonProperty("description")
    
    private String                    description;
    /**
     * Gets the description.
     * @return {@link String}
     */
    public String getDescription() {
        return description;
    }
    /**
     * Sets the description.
     * @param val the new value
     */
    public void setDescription(final String val) {
        description = val;
    }

    /** the damages. */
    @ManyToOne(targetEntity = LLDiceEntity.class, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "damages")
    @JsonProperty("dice")
  
    private LLDiceEntity    damages;
    /**
     * Gets the damages.
     * @return {@link LLDiceEntity}
     */
    public LLDiceEntity getDamages() {
        return damages;
    }
    /**
     * Sets the damages.
     * @param val the new value
     */
    public void setDamages(final LLDiceEntity val) {
        damages = val;
    }

    /** the cuts. */
    @Column(name = "cuts")
    @JsonProperty("cuts")
    
    private Long                    cuts;
    /**
     * Gets the cuts.
     * @return {@link Long}
     */
    public Long getCuts() {
        return cuts;
    }
    /**
     * Sets the cuts.
     * @param val the new value
     */
    public void setCuts(final Long val) {
        cuts = val;
    }

    /** the cut. */
    @Column(name = "cut")
    @JsonProperty("cut")
    
    private Boolean                    cut;
    /**
     * Gets the cut.
     * @return {@link Boolean}
     */
    public Boolean getCut() {
        return cut;
    }
    /**
     * Sets the cut.
     * @param val the new value
     */
    public void setCut(final Boolean val) {
        cut = val;
    }

    /** the critical. */
    @Column(name = "critical")
    @JsonProperty("critical")
    
    private Float                    critical;
    /**
     * Gets the critical.
     * @return {@link Float}
     */
    public Float getCritical() {
        return critical;
    }
    /**
     * Sets the critical.
     * @param val the new value
     */
    public void setCritical(final Float val) {
        critical = val;
    }

    /** the collidTime. */
    @Column(name = "collid_time")
    @JsonProperty("collid_time")
    
    private Long                    collidTime;
    /**
     * Gets the collidTime.
     * @return {@link Long}
     */
    public Long getCollidTime() {
        return collidTime;
    }
    /**
     * Sets the collidTime.
     * @param val the new value
     */
    public void setCollidTime(final Long val) {
        collidTime = val;
    }

    /** the collidState. */
    @Column(name = "collid_state")
    @JsonProperty("collid_state")
    
    private Long                    collidState;
    /**
     * Gets the collidState.
     * @return {@link Long}
     */
    public Long getCollidState() {
        return collidState;
    }
    /**
     * Sets the collidState.
     * @param val the new value
     */
    public void setCollidState(final Long val) {
        collidState = val;
    }

    /** the climbCount. */
    @Column(name = "climb_count")
    @JsonProperty("climb_count")
    
    private Float                    climbCount;
    /**
     * Gets the climbCount.
     * @return {@link Float}
     */
    public Float getClimbCount() {
        return climbCount;
    }
    /**
     * Sets the climbCount.
     * @param val the new value
     */
    public void setClimbCount(final Float val) {
        climbCount = val;
    }

    /** the behaviorParam. */
    @Column(name = "behavior_param")
    @JsonProperty("behavior_param")
    
    private Float                    behaviorParam;
    /**
     * Gets the behaviorParam.
     * @return {@link Float}
     */
    public Float getBehaviorParam() {
        return behaviorParam;
    }
    /**
     * Sets the behaviorParam.
     * @param val the new value
     */
    public void setBehaviorParam(final Float val) {
        behaviorParam = val;
    }

    /** the behavior. */
    @Column(name = "behavior")
    @JsonProperty("behavior")
    
    private Long                    behavior;
    /**
     * Gets the behavior.
     * @return {@link Long}
     */
    public Long getBehavior() {
        return behavior;
    }
    /**
     * Sets the behavior.
     * @param val the new value
     */
    public void setBehavior(final Long val) {
        behavior = val;
    }

    /** the attacksPerRound. */
    @Column(name = "attacks_per_round")
    @JsonProperty("attacks_per_round")
    
    private Long                    attacksPerRound;
    /**
     * Gets the attacksPerRound.
     * @return {@link Long}
     */
    public Long getAttacksPerRound() {
        return attacksPerRound;
    }
    /**
     * Sets the attacksPerRound.
     * @param val the new value
     */
    public void setAttacksPerRound(final Long val) {
        attacksPerRound = val;
    }

    /**
     * the list of {@link LLIoItemDataEntity}s associated with this
     * {@link LLIoNpcDataEntity}.
     */
    @OneToMany(targetEntity = LLIoItemDataEntity.class,
      fetch = FetchType.EAGER)
    @Fetch(FetchMode.SELECT)
    @JoinTable(name = "io_npc_data_inventory_items_lookup", schema = "ll",
  joinColumns = @JoinColumn(name = "io_npc_data_id",
  referencedColumnName = "io_npc_data_id"),
  inverseJoinColumns = @JoinColumn(name = "io_item_data_id",
  referencedColumnName = "io_item_data_id"))
    @JsonProperty("inventory_items")
    private List<LLIoItemDataEntity>    inventoryItems;
    /**
     * Gets the list of inventoryItemss.
     * @return {@link List}<{@link LLIoItemDataEntity}>
     */
    public List<LLIoItemDataEntity> getInventoryItems() {
        return inventoryItems;
    }
    /**
     * Sets the list of inventoryItemss.
     * @param val the new value
     */
    public void setInventoryItems(final List<LLIoItemDataEntity> val) {
        inventoryItems = val;
    }

    /**
     * the list of {@link LLGroupEntity}s associated with this
     * {@link LLIoNpcDataEntity}.
     */
    @OneToMany(targetEntity = LLGroupEntity.class,
      fetch = FetchType.EAGER)
    @Fetch(FetchMode.SELECT)
    @JoinTable(name = "io_npc_data_groups_lookup", schema = "ll",
  joinColumns = @JoinColumn(name = "io_npc_data_id",
  referencedColumnName = "io_npc_data_id"),
  inverseJoinColumns = @JoinColumn(name = "group_id",
  referencedColumnName = "group_id"))
    @JsonProperty("groups")
    private List<LLGroupEntity>    groups;
    /**
     * Gets the list of groupss.
     * @return {@link List}<{@link LLGroupEntity}>
     */
    public List<LLGroupEntity> getGroups() {
        return groups;
    }
    /**
     * Sets the list of groupss.
     * @param val the new value
     */
    public void setGroups(final List<LLGroupEntity> val) {
        groups = val;
    }

    @ElementCollection
    @CollectionTable(name = "io_npc_data_equipped_items_lookup",
  schema = "ll", joinColumns = @JoinColumn(name = "io_npc_data_id"))
    @MapKeyColumn(name = "key")
    @Column(name = "value")
    @JsonProperty("equipped_items")
    private Map<String, String> equippedItems;
    /**
     * Gets the map of equippedItemss.
     * @return {@link Map}<{@link String}, {@link String}>
     */
    public Map<String, String> getEquippedItems() {
        return equippedItems;
    }
    /**
     * Sets the mapping for equippedItemss.
     * @param val the new value
     */
    public void setEquippedItems(Map<String, String> val) {
        equippedItems = val;
    }

    @ElementCollection
    @CollectionTable(name = "io_npc_data_attributes_lookup",
  schema = "ll", joinColumns = @JoinColumn(name = "io_npc_data_id"))
    @MapKeyColumn(name = "key")
    @Column(name = "value")
    @JsonProperty("attributes")
    private Map<String, Integer> attributes;
    /**
     * Gets the map of attributes.
     * @return {@link Map}<{@link String}, {@link Integer}>
     */
    public Map<String, Integer> getAttributes() {
        return attributes;
    }
    /**
     * Sets the mapping for attributes.
     * @param val the new value
     */
    public void setAttributes(Map<String, Integer> val) {
        attributes = val;
    }

}

