
-- 2018-07-26T13:22:58.028
-- I forgot to set the DICTIONARY_ID_COMMENTS System Configurator
/* DDL */ CREATE TABLE public.M_Product_Allergen (AD_Client_ID NUMERIC(10) NOT NULL, AD_Org_ID NUMERIC(10) NOT NULL, Created TIMESTAMP WITH TIME ZONE NOT NULL, CreatedBy NUMERIC(10) NOT NULL, IsActive CHAR(1) CHECK (IsActive IN ('Y','N')) NOT NULL, M_Allergen_ID NUMERIC(10) NOT NULL, M_Product_Allergen_ID NUMERIC(10) NOT NULL, M_Product_ID NUMERIC(10), Updated TIMESTAMP WITH TIME ZONE NOT NULL, UpdatedBy NUMERIC(10) NOT NULL, CONSTRAINT MAllergen_MProductAllergen FOREIGN KEY (M_Allergen_ID) REFERENCES public.M_Allergen DEFERRABLE INITIALLY DEFERRED, CONSTRAINT M_Product_Allergen_Key PRIMARY KEY (M_Product_Allergen_ID), CONSTRAINT MProduct_MProductAllergen FOREIGN KEY (M_Product_ID) REFERENCES public.M_Product DEFERRABLE INITIALLY DEFERRED)
;

