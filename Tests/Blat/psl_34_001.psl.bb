��  h	      
      �        0       	       @  (	      )       *)      �*      �       �B       D      �      \\      �]                                                                                                                                                                              table bigPsl
"bigPsl pairwise alignment"
(
   string          chrom;           "Reference sequence chromosome or scaffold"
   uint            chromStart;      "Start position in chromosome"
   uint            chromEnd;        "End position in chromosome"
   string          name;            "Name or ID of item, ideally both human readable and unique"
   uint            score;           "Score (0-1000)"
   char[1]         strand;          "+ or - indicates whether the query aligns to the + or - strand on the reference"
   uint            thickStart;      "Start of where display should be thick (start codon)"
   uint            thickEnd;        "End of where display should be thick (stop codon)"
   uint            reserved;        "RGB value (use R,G,B string in input file)"
   int             blockCount;      "Number of blocks"
   int[blockCount] blockSizes;      "Comma separated list of block sizes"
   int[blockCount] chromStarts;     "Start positions relative to chromStart"
   uint            oChromStart;     "Start position in other chromosome"
   uint            oChromEnd;       "End position in other chromosome"
   char[1]         oStrand;         "+ or -, - means that psl was reversed into BED-compatible coordinates"
   uint            oChromSize;      "Size of other chromosome."
   int[blockCount] oChromStarts;    "Start positions relative to oChromStart or from oChromStart+oChromSize depending on strand"
   lstring         oSequence;       "Sequence on other chrom (or edit list, or empty)"
   string          oCDS;            "CDS in NCBI format"
   uint            chromSize;       "Size of target chromosome"
   uint            match;           "Number of bases matched."
   uint            misMatch;        "Number of bases that don't match"
   uint            repMatch;        "Number of bases that match but are part of repeats"
   uint            nCount;          "Number of 'N' bases"
   uint            seqType;         "0=empty, 1=nucleotide, 2=amino_acid"
)
 �            �?      �?     ��@     ��@@                                                               ���x
         
                
 chr1     =C�chr10   �chr13   VZ�chr18   @]�chr19   �<�chr2    ��~chr22   v�chr4    d�dchr8    vV�chr9 	   ��j       x����N�0�#΀2 !ހ	��d�ͥ+3L(
R���2���
gf�u��廬��7v�����1Ƙ��s�<><�d�Dd/,;����f
�,[O�Vt �(Y���5���4TĦ�~(�k�*Mֺat�����a�v��nn��I+r�c��$�8"3�zP�V3D�
U�̐.��Z1����B������ŕ�QBF�w�z��Y�0�i���s�x�^��÷�f�jG�$qN"w����)������ߧG����8G�|Hq΢[a@���D�;���Mx���1�0EӁJ�ɮ�&9��T&������Xp�,�X��m}��9w�>6��i�|8�'0a��%%U]Ef2z�B�j7�2���LM�V��1۬mi�b�j�R�KP�C�Ĳ-�u��-�����<��đ�*�o�A?DѕH�ExEzjuLax�-�A
B1D����ÕYd�om{)�PAp��xVpB�I��%���nׯ�k�?�� Uw����\��7(vT9�@����=@���e#�t�
��+�8��Sfd᣷ڐ�?T/��$�x���1� Ei2� =E2���BT�C��kt�z�t�'�:t�ַ���Fc�򸟞��*�r]2	3�Djc+|��IȦ�x�����c���^���UE��[Eo}臂]����B��ED"�?1#x�mίu��qV���C8��h�yT�<*�h@��5�J�x���A
1E���o����
ɤ�i���Paą.,��{y(�Qq)��&i���9��,��FN��i 6P�>���$�VGHXC-瑇j�䡪�,�F��^j![�XW��h�6�(�b�m�[���̮�f����h�"��B��hѪg�D��Iս�ȋ�J�7�q�7�%➅^�K�ZT�`*�M]k�x���;ND1E��F���Ɏ�-X�R��RB��X %K�j�~�Gvl'�=�nY��Ww�Ǯ���AE��s�E���!Phv�q��C��u�um���Z[G_g�u��`Z�e� ΙK������H�zݪ��4��r��[��!TD��C�z3�40t�1�y@��FJ^�Y��_��������Kt���>�$���GrV&�t���
��u5�jHx����1E�+N�-=pHv�$�et
�QQe`F`+��Gw5�l}�__ot�=w��;-Z.��`^͌r!A�i�LP�e�"o:�νZ�sW��>�֗���5�j�	��bJ��Lr#y���pf��a�R�I܄��'�<V6�q"����%I^x�M�=
1�-�WYZz����n�
�"!B��r�a'xEߨ�fx�C�7�p�V�I>�.b��s�>����K#ɀ5�`ɘ�-�81�E��ZT5F�Zk�F��ΫZy�g�.�O���6��zǤ��36!HX���-DԘ@�ؗ%y4ϔ��BlWTSj!�ꀽ��K�򟏼C�x�%��1�A���<ֹ$\�A�O
/^�(���a-����[J鵽/�ǒq?�BW�&��6���T�`Ɓ:�iđ�3d�3�r��-w�!�;sJ�!@j�{e)����/�'$yx�%���0դ��AT��dK�'1P�T\"�dB��|<��#��;����3���w��o���޶��N����Q�q�:Bf:"M�Z�t�X�~3�T���R�!��^�nh�#��h$   
           k 	   �A�              
     k     Y�!
               ���   ��(      �          k
%   �
%�      t          n�l   ��<      �          s    �<8�      �          ,�1   }�
�      �          ��   B��p      �          �=   ��      �          ��   ���      q       	   �A	   �A4      r                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          x�}ӿKa�����y��h�(R4T�E��4Fc�m� ��(!0� h�MJ�����?��%jU����nz�Ƀ��}���B�0Ͱ1�U�w%��uPz�v���h�Ŕ�u\D㏫b�%���}�*�{UW�鸈���5�����~u��?��}͗��|�Jo� x������YJ�A�$_��\���#�w�e�.���[6xy�1)�t�ћ��h3�~�h#[�w��m�GG�d>��f}c6#�L������\aJ?���6�o3��Co�w��A��퇎6ͤҳY��g�C��t�G��|��T��~������}����a!�l0yrmV����؎wL�1�F�h$              k 	   �A�*                   k 	   �A.)      g                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 x�mѿKBQ���s�z2� E
��A���	��!��13,h�-E	�CA�m�PR���.�Pk������s�<_��r.Q��M�?�9ϒ�e^nh����h�i]�BJ��}�7��A�J��hQ�31����r~�m���~��@�����v��R��W�}Y3K�������1͸��U������]�����ʃ�<�N)�vw�&zj�q�v�������U��m,��)k�E?u���d�L�ǽ{��z��蓚�7]FO�3��s�׾�"�E�,��2:�����խDD/���r���6����l ˙�������|�h$              k 	   �A D                   k 	   �A�B      K                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 x�mѿKa�����u���(�8�:qOA�јaC[?�p)Jn� h�%��jw�ht��Z��ϗ�x^�����;"�h%F[P$~j�e�#ʾ^�*$�T>���X��֣�G��ߒ���Li�V>��grtL=����������ۡt���z�eK���7����bK�������q=���D\�}��D�l*��{��W�	q���"�=W���-,����Z?q��{!���ý8p�G'���b!,��x�=���X���'ciL΋'0�?�cwMY���k.����M��ZO+6��ԍ[`��ryv��h$              k 	   �A�]                   k 	   �A`\      A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ��