package tss.tpm;

import tss.*;


// -----------This is an auto-generated file: do not edit

//>>>

/**
 *  Base class for empty union elements.
 *  An empty union element does not contain any data to marshal.
 *  This data structure can be used in place of any other union
 *  initialized with its own empty element.
 */
public class TPMS_NULL_UNION extends TpmStructure implements TPMU_SYM_DETAILS, TPMU_SCHEME_KEYEDHASH, TPMU_SIG_SCHEME, TPMU_KDF_SCHEME, TPMU_ASYM_SCHEME, TPMU_SIGNATURE
{
    public TPMS_NULL_UNION() {}
    
    @Override
    public String toString()
    {
        TpmStructurePrinter _p = new TpmStructurePrinter("TPMS_NULL_UNION");
        toStringInternal(_p, 1);
        _p.endStruct();
        return _p.toString();
    }
}

//<<<

